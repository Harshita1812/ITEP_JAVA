class RecordNotFoundException extends RuntimeException{
    public RecordNotFoundException(){
        super("record is not found ");
    }
    
}