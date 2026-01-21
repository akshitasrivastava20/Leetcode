class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int petrol=0;
        if(sum(gas)<sum(cost)) return -1;
        int i=0;int c=0;
            while(c!=gas.length){
                petrol=petrol+gas[i];
            if(petrol<cost[i])
                 {c=0;
                 petrol=0;
                    i=(i+1)%gas.length; 
                   }
            else{
                
                petrol=petrol-cost[i];
                i=(i+1)%gas.length; 
                c++;
            }
            }
             return i;
        
        
    }
    static int sum(int [] arr){
        int ans=0;
        for(int i:arr){
            ans+=i;
        }
        return ans;
    }

    }
    