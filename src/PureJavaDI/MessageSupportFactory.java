package PureJavaDI;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties properties;
    private MessageProvider messageProvider;
    private MessageRenderer messageRenderer;

    private MessageSupportFactory() {
        properties = new Properties();


        try {
          //  properties.load(this.getClass().getResourceAsStream("J:/projects/java-exercise/src/PureJavaDI/msf.properties"));
            FileInputStream fileInputStream=new FileInputStream("J:/projects/java-exercise/src/PureJavaDI/msf.properties");
            properties.load(fileInputStream);
            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");
            Class<?> messageProviderClass=Class.forName(providerClass);
            Class<?> messageRendererClass=Class.forName(rendererClass);
            messageRenderer = (MessageRenderer) messageRendererClass.getDeclaredConstructor().newInstance();
            messageProvider = (MessageProvider) messageProviderClass.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

static {
        instance = new MessageSupportFactory();
        }

public static MessageSupportFactory getInstance() {
        return instance;
        }

public MessageRenderer getMessageRenderer() {
        return messageRenderer;
        }

public MessageProvider getMessageProvider() {
        return messageProvider;
        }
}
