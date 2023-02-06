package javacore;

import org.json.JSONObject;

public class ProcessingString {
    public static void main(String[] args) {
String lines="key 1      value 1\n" +
        "key 2       value 2\n" +
        "key 3     value 3\n" +
        "key 4      value 4";
        String lin[] = lines.split("\\r?\\n");
        JSONObject jsonObject=new JSONObject();
for(int i=0;i<lin.length;i++) {
    String line = lin[i];
    String withoutSpaceLine = line.replaceAll("\\s", "");

    if (withoutSpaceLine.contains("key1")) {
        String keyLine = withoutSpaceLine.replaceAll("key1", "");
        jsonObject.put("key 1",keyLine);
    }

    if (withoutSpaceLine.contains("key2")) {
        String keyLine = withoutSpaceLine.replaceAll("key2", "");
        jsonObject.put("key 2",keyLine);
    }


    if (withoutSpaceLine.contains("key3")) {
        String keyLine = withoutSpaceLine.replaceAll("key3", "");
        jsonObject.put("key 3",keyLine);
    }

    if (withoutSpaceLine.contains("key4")) {
        String keyLine = withoutSpaceLine.replaceAll("key4", "");
        jsonObject.put("key 4",keyLine);
    }



}
        System.out.println(jsonObject.toString());



    }
}
