package baekjoon.baekjoon_2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(search(arr, N, M));
    }

    static int search(int[] arr, int N, int M) {
        int result = 0; // 결과값

        for(int i = 0; i < N - 2; i++) {
            for(int j = i + 1; j < N - 1; j++) {
                for(int k = j + 1; k < N; k++) {
                    int temp = arr[i] + arr[j] + arr[k]; // 비교를 위한 임시값

                    if(temp == M) {
                        return temp;
                    }

                    if(temp > result && temp < M) {
                        result = temp;
                    }
                }
            }
        }

        return result;
    }
}
