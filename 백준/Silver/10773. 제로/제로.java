import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(br.readLine());
      if (num == 0) {
        if (!stack.empty()) {
          stack.pop();
        }
        continue;
      }
      stack.push(num);
    }
    int sum = 0;
    while (!stack.empty()) {
      sum += stack.pop();
    }
    bw.write(sum + "");
    br.close();
    bw.close();
  }
}
