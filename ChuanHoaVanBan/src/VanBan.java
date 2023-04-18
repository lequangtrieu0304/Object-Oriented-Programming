public class VanBan {
    private String text;
    public VanBan(){
        this.text = "";
    }
    public VanBan(String text){
        this.text = text;
    }
    public int demSoTu(){
        int count = 0;
        String[] words = this.text.split("\\s+");
        for(String word : words){
            if(!word.trim().equals("")){
                count++;
            }
        }
        return count;
    }
    public int demKyTuA(){
        int count = 0;
        String lowerText = this.text.toLowerCase();
        System.out.println(lowerText.length());
        for(int i = 0; i < lowerText.length(); i++){
            if(lowerText.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
    public String chuanHoa(){
        String normalizedText = this.text.trim().replaceAll("\\s+", " ");
        String result = normalizedText;
        return result;
    }
}
