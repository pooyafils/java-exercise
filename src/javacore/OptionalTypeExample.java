package javacore;

import java.util.Optional;

public class OptionalTypeExample {
    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());
        return a.get()+b.get();
    }
    public static void main(String[] args) {
        String a="java";
        String b=null;
        Optional<String> optionalS=Optional.ofNullable(a);
        System.out.println(optionalS.isPresent());
        if(optionalS.isPresent()){
            System.out.println("is not null");
        }
        // example of Optional type in springboot
      //  Optional<RoomEntity> optinalEntity =  roomRepository.findById(roomId);
     //   RoomEntity roomEntity = optionalEntity.get();
    }
}
