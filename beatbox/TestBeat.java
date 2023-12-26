import java.util.Random;
/**
 * Some methods for playing beats and notes.
 * 
 * @author M. Kolling
 * @author Dave Ranson 
 * @version 29/11/2005
 */
public class TestBeat
{
    private BeatBox box;
    private static final int  C = 60, CS = 61, D = 62, DS = 63, E = 64, F = 65, FS = 66, G = 67, GS = 68, A = 69, AS = 70, B = 71, OCTAVE = 12;
    private Random random = new Random();
    private int position = 0;

    /**
     * Constructor for objects of class TestBeat
     */
    public TestBeat()
    {
        box = new BeatBox();
    }

    /**
     * A very simple beat.
     */
    public void testBeat1()
    {
        // standard 16 tick track
        box.newTrack(16);

        // straight base line
        box.addBeat(0, 35);
        box.addBeat(4, 35);
        box.addBeat(8, 35);
        box.addBeat(12, 35);

        // clapping on the off-beat...
        box.addBeat(6, 39);
        box.addBeat(10, 39);
        box.addBeat(11, 39);

        box.addBeat(2, 81);

        box.endTrack();
        box.start();
    }

    public void testBeat4()
    {
        // track
        box.newTrack(16);

        // base
        box.addBeat(0, 35);
        box.addBeat(3, 35);
        box.addBeat(4, 35);
        box.addBeat(7, 35);
        box.addBeat(8, 35);
        box.addBeat(9, 35);
        box.addBeat(11, 35);
        box.addBeat(12, 35);

        // clap
        box.addBeat(2, 39);
        box.addBeat(6, 39);
        box.addBeat(10, 39);
        box.addBeat(14, 39);

        box.endTrack();
        box.start();
    }

    /**
     * A standard rock beat.
     */
    public void testBeat2()
    {
        // standard 16 tick (4 beat) track
        box.newTrack(16);

        // base drum
        box.addBeat(0, 35);
        box.addBeat(2, 35);
        box.addBeat(3, 35);
        box.addBeat(7, 35);
        box.addBeat(9, 35);
        box.addBeat(10, 35);
        box.addBeat(15, 35);

        // pedal hi-hat straight every second tick
        for(int i=0; i<16; i+=2) {
            box.addBeat(i, 44);
        }

        // cymbal straight on every beat
        for(int i=0; i<16; i+=4) {
            box.addBeat(i, 49);
        }

        // and an acoustic snare at the off beats...
        box.addBeat(4, 38);
        box.addBeat(12, 38);

        box.endTrack();
        box.start();
    }

    public void testBeat3()
    {
        // standard 16 tick (4 beat) track
        box.newTrack(16);

        // base drum
        box.addBeat(0, 36);
        box.addBeat(3, 36);
        box.addBeat(6, 36);
        box.addBeat(9, 36);
        box.addBeat(15, 36);

        // pedal hi-hat on the counter beat
        for(int i=2; i<16; i+=4) {
            box.addBeat(i, 44);
        }

        // clap your hands
        box.addBeat(4, 39);
        box.addBeat(12, 39);

        box.addBeat(13, 50);  // high tom
        box.addBeat(14, 45);  // low tom

        // and a few hits on the old cow bell
        box.addBeat(0, 56);
        box.addBeat(2, 56);
        box.addBeat(6, 56);
        box.addBeat(10, 56);
        box.addBeat(12, 56);

        box.endTrack();
        box.start();
    }

    public void stop()
    {
        box.stop();
    }

    public void setTempo(int newTempo)
    {
        box.setTempo(newTempo);
    }

    public static void main(String[] args) 
    {
        TestBeat test = new TestBeat();
        test.testBeat3();
    }

    /**
     * Counts the total number of beats in an array of durations
     * @param durations     An array of durations of notes
     * @return  The total number of beats 
     */
    private int duration (int [] durations)
    {
        int d = 0;
        for (int i = 0; i < durations.length; i++)
        {
            d += durations[i];
        }
        return d;    
    }

    /**
     * Plays Jingle Bells (badly)
     */
    public void jingle() 
    {
        int notes [] =     {E,E,E,E,E,E,E,G,C,D,E,F,F,F,F,F,E,E,E,E,G,G,F,D,C};
        int durations [] = {2,2,4,2,2,4,2,2,2,2,4,2,2,2,2,2,2,2,1,1,2,2,2,2,4};        
        play (durations, notes);                     
    }

    /**
     * <p>Adds notes and durations to the beat box. The position of where the notes are placed
     * is determined by the global position variable</p>
     * @param durations     The durations of the notes to add
     * @param notes         The pitches of the notes to add
     */
    private void add (int [] durations, int [] notes)
    {
        if (notes.length != durations.length)
        {
            System.err.println ("There should be an equal number of notes and durations");
            System.exit(0);
        }

        for (int i = 0; i < notes.length; i++)
        {            
            box.addNote(position, durations[i], notes[i]);    
            position += durations[i];
        }    
    }

    /**
     * Plays the specified notes on the piano
     * @param durations     The durations for each of the notes
     * @param notes         The pitches for the notes
     */
    private void play (int [] durations, int [] notes)
    {               
        //the position (in ticks) to add the next note         
        int position = 0; 

        if (notes.length != durations.length)
        {
            System.err.println ("There should be an equal number of notes and durations");
            System.exit(0);
        }

        box.newTrack (duration(durations));

        for (int i = 0; i < notes.length; i++)
        {          
            box.addNote(position, durations[i], notes[i]);            
            position += durations[i];
        }      

        box.endTrack();
        box.start();            
    }

    /**
     * Plays a boogie bass line (very badly)and a random improvisation
     */    
    public void boogie()
    {
        position = 0;

        int durations [] = {3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1};
        int notes [] = { C - OCTAVE,C,E - OCTAVE,E,G - OCTAVE,G,A- OCTAVE,A,AS - OCTAVE,AS,A - OCTAVE,A,G - OCTAVE,G,E - OCTAVE,E};
        int notes2 [] = { D - OCTAVE,D,E - OCTAVE,E,F - OCTAVE,F,FS- OCTAVE,FS,G - OCTAVE,G,F - OCTAVE,F,E - OCTAVE,E,D - OCTAVE,D};

        box.newTrack (duration (durations) * 5);
        box.setTempo (160);
        add (durations, notes);
        add (durations, notes);
        add (durations, transpose (notes,5));
        add (durations, notes);
        add (durations, notes2);        

        //add some kind of beat maybe... 
        //addBeat (16 ,39);
        // addBeat (8, 35);
        int position = 0;
        /*
         * Add a terrible random improvisation, each for loop adds the improvisation for 8 beats, where the
         * base note for getting the random note changes to the note being played at the time. 
         */
        for (int j = 0; j < 2; j++)
            for (int i = 0; i < notes.length ; i++)
            {
                if (i % 2== 0)               
                    box.addNote (position, 4, transpose (scale (notes[i]), OCTAVE));
                position += durations[i];
            }

        for (int i = 0; i < notes.length ; i++)
        {
            if (i % 2== 0)
                box.addNote (position, 4, transpose (scale (transpose(notes[i],5)), OCTAVE));
            position += durations[i];
        }

        for (int i = 0; i < notes.length ; i++)
        {
            if (i % 2== 0)               
                box.addNote (position, 4, transpose (scale (notes[i]), OCTAVE));
            position += durations[i];
        }

        for (int i = 0; i < notes2.length ; i++)
        {
            if (i % 2== 0)
                if (random.nextDouble() < 0.7)
                    box.addNote (position, 4, transpose (scale (notes2[i]), OCTAVE));
                else
                    addChord (transpose  (scale (notes2[i]), OCTAVE),4, position);

            position += durations[i];
        }

        box.endTrack();
        box.start();
    }

    /**    
     * Used to get a random note from the specified blues scale. Not sure the semitones are quite right here!!
     *
     * @param  The base for the scale, for example starting on middle C would be 60
     * @return A random note from the specified blues scale
     */
    private int scale (int base)
    {       
        int r = random.nextInt(6);
        switch (r)
        {
            case 0:return base;
            case 1: return base + 2;
            case 2: return base + 3;
            case 3: return base + 5;
            case 4: return base + 7;
            case 5: return base + 10;                                               
        }
        return base;
    }

    /**
     * Adds a beat to the existing beat box with the specified frequency (for example 4 would play the beat every four ticks)
     * @param frequency     How frequent the beat is
     * @param instrument    The instrument to play the beat with
     */
    private void addBeat ( int frequency, int instrument)
    {
        for (int i = 0; i < position; i++)
        {
            if (i % frequency == frequency - 1)
                box.addBeat (i, instrument);
        }
    }

    /**
     * Transposes an array of notes up or down a number of semitones
     * @param   notes   The notes to transpose
     * @param   n       The number of semitones to transpose the notes
     * @return  The transposed notes
     */
    private int [] transpose (int [] notes, int n)
    {
        int [] transposed = new int [notes.length];
        for (int i = 0; i < notes.length; i++)
            transposed [i] = notes [i] + n;

        return transposed;       
    }

    /**
     * Transposes a note up or dowmn a number of semitones
     * @param note  The note to transpose
     * @param n     The number of semitones
     * @return      The transposed pitch
     */    
    private int transpose (int note, int n)
    {
        return note + n;
    }

    /**
     * Add a seventh chord occasionally
     */
    private void addChord (int note, int duration, int position)
    {                               
        box.addNote (position, duration, note + 10);
        box.addNote (position, duration, note + 4 + 10);
        box.addNote (position, duration, note + 7 + 10);
        box.addNote (position, duration, note + 10 + 10);

    }

}

