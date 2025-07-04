// Link: https://leetcode.com/problems/pascals-triangle/description/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> lw = new ArrayList<>();
        lw.add(1);
        list.add(lw);
        if(numRows == 1) {
            return list;
        }

        List<Integer> lw1 = new ArrayList<>();
        lw1.add(1);
        lw1.add(1);
        list.add(lw1);

        for(int i = 2; i < numRows; i++) {
            List<Integer> l = new ArrayList<>();
            List<Integer> p = list.get(i-1);
            // манипуляции
            l.add(1);
            for(int j = 1; j < i; j++) {
                l.add(p.get(j-1) + p.get(j));
            }
            l.add(1);

            list.add(l);
        }

        return list;
    }
}