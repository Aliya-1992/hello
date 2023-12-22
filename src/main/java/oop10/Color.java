package oop10;

public enum Color {
    RED("#FFFF"), BLUE("#HT&77"), GREEN("#455554"), BLACK("4444566"), WHITE("#YYY66");
    private String code;
    Color(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}
