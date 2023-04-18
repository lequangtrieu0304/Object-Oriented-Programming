package entity;

public class NormalStudent extends Student {
    private int englishScore;
    private int entryTestScore;

    public NormalStudent() {
    }

    public NormalStudent(int englishScore, int entryTestScore) {
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(int entryTestScore) {
        this.entryTestScore = entryTestScore;
    }
    @Override
    public void showMyInfo() {

    }
}
