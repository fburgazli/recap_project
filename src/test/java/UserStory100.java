public class UserStory100 {
private String word;
private int amount;
public UserStory100(String word, int amount){
    this.word = word;
    this.amount = amount;
}

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "UserStory100{" +
                "word='" + word + '\'' +
                ", amount=" + amount +
                '}';
    }
}
