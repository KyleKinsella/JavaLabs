public class CD extends LibraryItem{

    private String band;
    private String title;
    private int numTracks;

    public CD(String band, String title, int numTracks) {
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }


    public void setBand(String band) {
        this.band = band;
    }

    public String getBand() {
        return band;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    public int getNumTracks() {
        return numTracks;
    }


    @Override
    public double calculatePrice() {
        // TODO Auto-generated method stub
        return numTracks * 2;
    }
}
