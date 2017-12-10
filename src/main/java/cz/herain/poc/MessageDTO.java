package cz.herain.poc;

public class MessageDTO {

    public MessageDTO(final String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
