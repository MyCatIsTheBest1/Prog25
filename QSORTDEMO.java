class Quicksort {
	//Настройка вызова метода быстрой сортировки
	public static void qsort(char [] items) {
		qs(items, 0, items.length-1);
	}
	//Рекурсивная версия быстрой сортировки массива
	private static void qs (char[] items, int left, int right) {
		int i, j;
		char x, y;
		i = left;
		j = right;
		x = items[(left+right)/2];

		do {
			while((items[i] < x) && (i < right))
				i++;
			while(x < items[j] && (j > left)) 
				j--;
			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}

		}
		while (i <= j);

		if (left < j)
			qs(items, left, j);

		if(i < right) 
			qs(items, i, right);
	}
}
class QSortDemo {
	public static void main (String[] args) {
		long startTime = System.currentTimeMillis();
		char [] a = {'d', 'd', 's', 'f', 'a', 'e', 'w', 'q'};
		int i;

		System.out.println("Исходный массив: ");
		for (i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();
		//Сортировка массива
		Quicksort.qsort(a);
		System.out.println("Отсортированный массив: ");
		for (i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();
		long endTime = System.currentTimeMillis();
		System.out.println("Время сортировки массива: " + (endTime - startTime) + "мс");
	
	long startTimeBubble = System.currentTimeMillis();
	int a1, b;
	char t;
	int size1 = a.length;
	System.out.println();
	for (a1 = 1; a1 < size1; a1++)
		for (b = size1-1; b >= a1; b--) {
			if (a[b-1] > a[b]) {
				t = a[b-1];
				a[b-1] = a[b];
				a[b] = t;
			}
		}

	for(i=0; i < size1; i++)
		System.out.print(" " + a[i]);
	System.out.println();
	long endTimeBubble = System.currentTimeMillis();
	System.out.println("Время сортировки массива пузырьковым методом: " + (endTimeBubble - startTimeBubble) + " мс");
	}
}
