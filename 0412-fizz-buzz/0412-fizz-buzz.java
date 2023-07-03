class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> output = new ArrayList<>();

        for (int i = 1; i<=n; i++) {
            
            String answer = "";

            if (i % 3 == 0) {
                answer += "Fizz";
            }
            if (i % 5 == 0) {
                answer += "Buzz";
            }
            if (answer.length() == 0) {
                answer = String.valueOf(i);
            }
            output.add(answer);
        }
        return output;
    }
}