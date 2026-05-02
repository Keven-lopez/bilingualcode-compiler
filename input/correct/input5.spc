start

constante limite as numero = 3;
define contador como number;
set contador to 1;

function verificar(x) do
    if x == 2 entonces
        mostrar "Valor especial";
    else
        display "Valor normal";
    end_if;
end_function;

while contador <= limite do
    call verificar(contador);
    set contador to contador + 1;
end_while;

finish