package respace;

public class Main {
    public static void main(String[] args){

        String[] dictionary = new String[]{"aaysaayayaasyya","yyas","yayysaaayasasssy",
                "yaasassssssayaassyaayaayaasssasysssaaayysaaasaysyaasaaaaaasayaayayysasaaaa","aya","sya","ysasasy",
                "syaaaa","aaaas","ysa","a","aasyaaassyaayaayaasyayaa","ssaayayyssyaayyysyayaasaaa","aya","aaasaay",
                "aaaa","ayyyayssaasasysaasaaayassasysaaayaassyysyaysaayyasayaaysyyaasasasaayyasasyaaaasysasy","aaasa",
                "ysayssyasyyaaasyaaaayaaaaaaaaassaaa","aasayaaaayssayyaayaaaaayaaays","s"};

        String sentence = "asasayaayaassayyayyyyssyaassasaysaaysaayaaaaysyaaaa";

        int respace = new Solution().respace1(dictionary, sentence);

        System.out.println(respace);
    }
}
