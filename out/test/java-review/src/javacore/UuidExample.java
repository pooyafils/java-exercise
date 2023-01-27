package javacore;

import java.util.UUID;

public class UuidExample {
    public static void main(String[] args) {
        //create uuid
        UUID uuid=UUID.randomUUID();
        System.out.println(uuid);
        // version
        UUID ver1=UUID.fromString("ca44ad12-8aa6-4364-91a3-7f24ffb324e8");
     //   System.out.println(ver1.version());
        //variant
        UUID variant=UUID.randomUUID();
        System.out.println("UUID variant is: "+ variant.variant());
        // node
        UUID uuids = UUID.fromString("237e9877-e79b-12d4-a765-321741963000");
        System.out.println("Node value: "+ uuids);
    }
}
