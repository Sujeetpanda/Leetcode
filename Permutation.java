class Permutation {
     List<List<Integer>> finalList = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permutenumbers(nums,0,nums.length - 1);
        return finalList;
    }
    void permutenumbers(int[] nums,int start,int end) {
        if(start == end) {
            List<Integer> list = new ArrayList<Integer>();
            for(int i =0; i < nums.length;i++){
                list.add(nums[i]);
            }
            finalList.add(list);
        }
        for(int i = start;i <= end;i++){
            swap(nums,start,i);
            permutenumbers(nums,start+1,end);
            swap(nums,start,i);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
