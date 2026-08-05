package Song;

public class Song {
    private String group;
    private String title;
    private int duration;

    public Song(String group, String title, int duration) {
        this.group = group;
        this.title = title;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Song)) {
            return false;
        }
        Song comparedSong = (Song) obj;
        return this.group.equals(comparedSong.group)
                && this.title.equals(comparedSong.title)
                && this.duration == comparedSong.duration;
    }
}
