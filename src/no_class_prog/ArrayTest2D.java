public class ArrayTest2D {
    public static void main(String[] args){
        String meta[] = {"No.","Name","Development","Teaching by"};
        String j17273[] = {"J17273","Nakagawa","Network - CCN","Masaki Hanada"};
        String g19006[] = {"G19006","Sano","Security - Phising","Masaki Hanada","FOOOOOO"};

        String teachingMember[][] = {meta,j17273,g19006};

        for(int y=0; y<teachingMember.length;y++){
            System.out.print("| y="+y+" |");
            for(int x=0; x<teachingMember[y].length;x++){
                System.out.print("\t x="+x+":"+teachingMember[y][x]);
            }
            System.out.println();
        }
    }
}
