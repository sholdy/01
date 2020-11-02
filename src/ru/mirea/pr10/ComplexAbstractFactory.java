package ru.mirea.pr10;

import ru.mirea.pr10.Complex;

public interface ComplexAbstractFactory
{
    Complex createComplex();
    Complex CreateComplex(int real, int image);
}