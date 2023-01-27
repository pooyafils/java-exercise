package java9recipes.chapter8.ExternalizableProgramSettings;
import java.awt.*;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;

public class ExternalizableProgramSettings implements Externalizable {
    private Point locationOnScreen;
    private Dimension frameSize;
    private Color defaultFontColor;
    private String title;

    public ExternalizableProgramSettings() {
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
      out.writeInt(locationOnScreen.x);
        out.writeInt(locationOnScreen.y);
        out.writeInt(frameSize.width);
        out.writeInt(frameSize.height);
        out.writeInt(defaultFontColor.getRGB());
        out.writeUTF(title);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        locationOnScreen=new Point(in.readInt(),in.readInt());
        frameSize = new Dimension(in.readInt(), in.readInt());
        defaultFontColor = new Color(in.readInt());
        title = in.readUTF();
    }

    public ExternalizableProgramSettings(Point locationOnScreen,
                                         Dimension frameSize, Color defaultFontColor, String title) {
        this.locationOnScreen = locationOnScreen;
        this.frameSize = frameSize;
        this.defaultFontColor = defaultFontColor;
        this.title = title;
    }

    public Point getLocationOnScreen() {
        return locationOnScreen;
    }

    public void setLocationOnScreen(Point locationOnScreen) {
        this.locationOnScreen = locationOnScreen;
    }

    public Dimension getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(Dimension frameSize) {
        this.frameSize = frameSize;
    }

    public Color getDefaultFontColor() {
        return defaultFontColor;
    }

    public void setDefaultFontColor(Color defaultFontColor) {
        this.defaultFontColor = defaultFontColor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExternalizableProgramSettings that = (ExternalizableProgramSettings) o;
        return locationOnScreen.equals(that.locationOnScreen) &&
                frameSize.equals(that.frameSize) &&
                defaultFontColor.equals(that.defaultFontColor) &&
                title.equals(that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationOnScreen, frameSize, defaultFontColor, title);
    }
}
