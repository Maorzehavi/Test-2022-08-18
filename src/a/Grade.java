package a;

public class Grade {
    private Profession profession;
    private int score;



    public Grade(Profession profession, int score) {
        this.profession = profession;
        try {
            setScore(score);
        } catch (ScoreOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws ScoreOutOfBoundsException {
        if (score < 40 || score > 100) {
            throw new ScoreOutOfBoundsException("Score out of bounds");
        }
        this.score = score;
    }

    @Override
    public String toString() {
        return "\nProfession: " + profession +
                "\nScore: " + score;
    }
}


