class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) { 
        Map<String , Integer> seenstate = new HashMap<>();
        for(int day=0 ; n>0 ; day++){

        String statekey= Arrays.toString(cells);
        if(seenstate.containsKey(statekey))
        {
            int cyclelength = day-seenstate.get(statekey);
            n=n% cyclelength;
            if(n==0) break;
          
            seenstate.clear();
        }
        seenstate.put(statekey,day);
        int[] newArray = new int[cells.length] ;
        newArray[0] = 0;
        newArray[cells.length-1]=0;
        for(int i =1 ; i<cells.length-1;i++)
        {   
            if(cells[i-1]==cells[i+1])
            {
                newArray[i]=1;
            }
            else
            {
                newArray[i]=0;
            }
        }
        cells = newArray;
        n--;
        }
       return cells;
    }
}