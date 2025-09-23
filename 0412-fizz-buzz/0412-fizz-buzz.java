class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> List = new ArrayList<>();
        for(int curr=1; curr<=n; curr++){
            if(curr%3 == 0 && curr%5 == 0){
                List.add("FizzBuzz");
            }else if(curr%3 == 0){
                List.add("Fizz");
            }else if(curr%5 == 0){
                List.add("Buzz");
            }else{
                List.add(curr +"");
            }
            
        }
        return List;
        
    }
}