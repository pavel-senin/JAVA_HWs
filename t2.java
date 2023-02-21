class t2{
    public static void main(String[] args) {
        //Вывести все простые числа от 1 до 1000
        int simple=1;
        for (int i = 1; i<=1000; i++)
        {
            boolean md = false;
            for (int j = 1; j<=i/2 && md==false; j++)
            {
                if (i%j==0 && j!=1 && j!=i)
                {
                    md=true;
                }
            }
            if (md==false)
            {
                System.out.printf("%d simple number: %d ", simple++, i);
                System.out.println();
            }
        }
    }
}
