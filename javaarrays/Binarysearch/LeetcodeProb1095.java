package Binarysearch;
//leetcode hard problem
public class LeetcodeProb1095<MountainArray> {
    public static void main(String[] args) {
    }
        public int findInMountainArray(int target, MountainArray mountainArr) {
            int peak = findPeakElement(mountainArr);
            int ans1 = ascending(mountainArr, target, peak);
            int ans2 = descending(mountainArr, target, peak);
            if(ans1 != -1){
                return ans1;
            }else{
                return ans2;
            }
        }
        public int findPeakElement(MountainArray mountainArr){
            int start = 0;
            int end = mountainArr.length() - 1;
            while(start < end){
                int mid = start + (end - start)/2;
                if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                    end = mid;
                }else{
                    start = mid + 1;
                }
            }
            return start;
        }

        //to find first occurence of target
        //apply order agnostics binary search here....peak element ke left side wala part is in
        //ascending order
        public int ascending(MountainArray mountainArr, int target, int start){
            int start2 = 0;
            int end2 = start;
            while(start2 <= end2){
                int mid = start2 + (end2 - start2)/2;
                int value = mountainArr.get(mid);
                if(target == value){
                    return mid;
                }
                else if(target > value) start2 = mid + 1;
                else if(target < value) end2 = mid - 1;
            }
            return -1;
        }

        //on the right side of peak element-->elements are in desceding order
        public int descending(MountainArray mountainArr, int target, int start){
            int start2 = start;
            int end2 = mountainArr.length() - 1;
            while(start2 <= end2){
                int mid = start2 + (end2 - start2)/2;
                int value = mountainArr.get(mid);
                if(target == value){
                    return mid;
                }
                else if(target > value) end2 = mid - 1;
                else if(target < value) start2 = mid + 1;
            }
            return -1;
        }
}
