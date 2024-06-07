class Solution { 
	static public int searchInsert(int[] nums, int target) {
        	int fin = nums.length,inicio = 0;
        	if (target>=nums[nums.length/2]) {
            		inicio = nums.length/2;
            		fin = nums.length;
        	}else{
            		inicio=1;
            		fin = (nums.length/2)+1;
        	}
        	if (target<=nums[0]) {
            		return 0;
        	}
        	if (target>=nums[nums.length-1]) {
            		return nums.length; 
        	}
        	for (int i = inicio; i < fin; i++) {
            		if ((target>nums[i-1]&&target<nums[i])|| target==nums[i]) {
                	return i;       
            		}
        	}
        	return -1;    
	}    
}