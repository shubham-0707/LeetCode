class Frequency {
    char character;
    int frequency;

    Frequency(char character , int frequency) {
        this.character = character;
        this.frequency = frequency;
    }
}

class Solution {
    public String frequencySort(String s) {
        
        TreeMap<Character , Integer> tree = new TreeMap<Character , Integer>(Collections.reverseOrder());

        for(int i=0 ; i<s.length() ; i++) {
            tree.put(s.charAt(i), tree.getOrDefault(s.charAt(i), 0)+1);
        }

        List<Frequency> freqList = new ArrayList<>();
        for(char ch : tree.keySet()) {
            freqList.add(new Frequency(ch , tree.get(ch)));
        }

        Collections.sort(freqList , new Comparator<Frequency>() {

            public int compare(Frequency f0 , Frequency f1) {
                return f1.frequency - f0.frequency;
            }
        } );



        String ans = "";

        for(Frequency f : freqList) {
            for(int i=0 ; i<f.frequency ; i++) {
                ans+=f.character;
            }
        }

        return ans;
    }
}