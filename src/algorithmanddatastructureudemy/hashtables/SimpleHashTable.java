package algorithmanddatastructureudemy.hashtables;


public class SimpleHashTable {
    private StoreEmpoloy[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoreEmpoloy[10];
    }
    private int hashKey(String key){
        return key.length()%hashTable.length;
    }
    public void put(String key,employee employee){
        int hashKey=hashKey(key);
        if(occupaid(hashKey)){
            int stopIndex=hashKey;
            if(hashKey==hashTable.length-1){
                hashKey=0;
            }
            else {
                hashKey++;
            }
            while (occupaid(hashKey)&& hashKey!=stopIndex){
                hashKey=(hashKey+1)%hashTable.length;
            }
        }
        if(occupaid(hashKey)){
            System.out.println("=======================");
        }
        else {
            hashTable[hashKey]= new StoreEmpoloy(key,employee);
        }
    }

    public employee get(String key){
        int hashKeyed=findkey(key);
        if(hashKeyed==-1){
            return null;
        }
        return hashTable[hashKeyed].employee;
    }

    public  void pringHashTable(){
        for(int i=0;i<hashTable.length;i++){
            if(hashTable[i]==null){
                System.out.println("empty");
            }
            else {
            System.out.println("postion is "+i+" : "+hashTable[i].employee);
        }}
    }
    private boolean occupaid(int index) {
        return hashTable[index] != null;

    }

    private int findkey(String key){
        int hashedKey=hashKey(key);
        if(hashTable[hashedKey]!=null&& hashTable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        int stopIndex=hashedKey;
            if(hashedKey==hashTable.length-1){
                hashedKey=0;
            }
            else {
                hashedKey++;
            }
            while ( hashedKey!=stopIndex && hashTable[hashedKey]!=null && !hashTable[hashedKey].key.equals(key)){
                hashedKey=(hashedKey+1)%hashTable.length;

        }
if(stopIndex==hashedKey){
    return -1;
}
else {
    return hashedKey;
}
    }




}
