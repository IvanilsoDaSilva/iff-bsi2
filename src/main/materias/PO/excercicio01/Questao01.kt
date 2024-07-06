package PO.excercicio01;

import java.util.Scanner;

// Função para printar a matriz
public fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        for (element in row) {
            print("$element ");
        }
        println();
    }
}

public fun printMatrix(matrix: IntArray) {
    for (element in matrix) {
        print("$element ");
    }
    println();
}

public fun main() {
    val matrixA = arrayOf(
        intArrayOf(0, 2, 8, 1, 7),
        intArrayOf(1, 5, 8, 2, 2),
        intArrayOf(3, 4, 0, 8, 1),
        intArrayOf(9, 1, 2, 7, 2),
        intArrayOf(3, 0, 1, 0, 4)
    );

    println("Quesão 01"+"\n\nMatriz A:");
    printMatrix(matrixA);
    println("\na) "+ a(matrixA));
    println("\nb) "+ b(matrixA));
    println("\nc) "+ c(matrixA));
    println("\nd) "+ d(matrixA));
    println("\ne) "+ e(matrixA));
    println("\nf) "+ f(matrixA));
    println("\ng) "+ g(matrixA));
    println("\nh) "+ h(matrixA));
    print("\ni) "); printMatrix(i(matrixA))
    print("\ni) "); printMatrix(j(matrixA))
}

public fun a(matrix: Array<IntArray>): Int {
    val rows = matrix.size;
    val columns = matrix[0].size;
    var sum = 0;

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            sum += matrix[i][j];
        }
    }
    return sum;
}

public fun b(matrix: Array<IntArray>): Int {
    val rows = matrix.size;
    val columns = matrix[0].size;
    var sum = 0;

    for (j in 0 until columns) {
        for (i in 0 until rows) {
            sum += matrix[i][j];
        }
    }
    return sum;
}

public fun c(matrix: Array<IntArray>): Int {
    val rows = matrix.size;
    val columns = matrix[0].size;
    var sum = 0;

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            if (i != j) {
                sum += matrix[i][j];
            }
        }
    }
    return sum;
}

public fun d(matrix: Array<IntArray>): Int {
    val rows = matrix.size;
    val columns = matrix[0].size;
    var sum = 0;

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            if (i == j) {
                sum += matrix[i][j];
            }
        }
    }
    return sum;
}

public fun e(matrix: Array<IntArray>): Int {
    val rows = matrix.size;
    val columns = matrix[0].size;
    var sum = 0;

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            if (i < j) {
                sum += matrix[i][j];
            }
        }
    }
    return sum;
}

public fun f(matrix: Array<IntArray>): Int {
    val rows = matrix.size;
    val columns = matrix[0].size;
    var sum = 0;

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            if (i > j) {
                sum += matrix[i][j];
            }
        }
    }
    return sum;
}

public fun g(matrix: Array<IntArray>): Int {
    val rows = matrix.size;
    val columns = matrix[0].size;
    var sum = 0;

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            if (i < j) {
                sum += matrix[i][j] * matrix[j][i];
            }
        }
    }
    return sum;
}

public fun h(matrix: Array<IntArray>): Int {
    val input = Scanner(System.`in`);

    val rows = matrix.size;
    val columns = matrix[0].size;
    var sum = 0;
    print("Escreva o valor de x a ser multiplicado pela soma da matriz: ")
    var x = input.nextInt();

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            sum += matrix[i][j];
        }
    }

    return x*sum;
}

public fun i(matrix: Array<IntArray>): IntArray {
    val rows = matrix.size;
    val columns = matrix[0].size;
    var sum = 0;

    var vectorV = intArrayOf(0,0,0,0,0);

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            vectorV[j] += matrix[i][j];
        }
    }

    return vectorV;
}

public fun j(matrix: Array<IntArray>): IntArray {
    val rows = matrix.size;
    val columns = matrix[0].size;
    var sum = 0;

    var vectorV = intArrayOf(1,1,1,1,1);

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            vectorV[i] *= matrix[i][j];
        }
    }

    return vectorV;
}
