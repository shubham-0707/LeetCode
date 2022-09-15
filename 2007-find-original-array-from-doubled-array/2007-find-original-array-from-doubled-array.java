class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer , Integer> hash = new TreeMap<>();
        
        for(int i=0 ; i<changed.length ; i++){
            hash.put(changed[i] , hash.getOrDefault(changed[i] , 0)+1);
        }
        
        while(true){
            int x = -1;
            for(int i : hash.keySet()){
                x = i;
                break;
            }
            
            if(x==0 && hash.get(x)<2){
                break;
            }
            
            if(hash.size()==0 || hash.containsKey(2*x)==false){
                break;
            }
            
            
            
            else if(hash.containsKey(2*x)){
                if(x==0){
                    int mini = hash.get(0)/2;
                    for(int i=0 ; i<mini; i++){
                        ans.add(x);
                    }
                    hash.remove(x);
                }
                
                
                else if(x!=0){
                    
                    int mini = Math.min(hash.get(x) , hash.get(2*x));
                    for(int i=0 ; i<mini ; i++){
                        ans.add(x);
                    }
                    
                    if(hash.get(x)==hash.get(2*x)){
                        hash.remove(x);
                        hash.remove(2*x);
                    }
                    else if(hash.get(x)<hash.get(2*x)){
                        int c = hash.get(x);
                        hash.remove(x);
                        hash.put(2*x , hash.get(2*x)-c);
                        if(hash.get(2*x)==0)hash.remove(2*x);
                    }
                    else if(hash.get(x)>hash.get(2*x)) return new int[0];
                    
                }
            }
        }
        
        if(hash.size()==0){
            int[] ans_main = new int[ans.size()];
            for(int i=0 ; i<ans.size() ; i++){
                ans_main[i] = ans.get(i);
            }
            return ans_main;
        }
        
        return new int[0];
    }
}