# Втора лабораториска вежба по Софтверско инженерство
## Ангел Ристевски, број на индекс 171012
### Група на код:
Ја добив групата на код 5.
### Control Flow Graph


![control flow graph](https://user-images.githubusercontent.com/48767427/83369930-21899580-a3be-11ea-9b46-bdaa565551f2.png)


### Цикломатска комплексност
Цикломатската комплексност на овој код е 6. Таа може да ја пресметаме на 3 различни начини:

1. Првиот начин е да го изброиме бројот на региони во control flow графот кој го нацртавме и кој изнесува 6.

2. Вториот начин на кој може да ја пресметаме цикломатската комплексност е преку формулата V(G) = E - N + 2, каде E го означува бројот на ребра во control flow графот, а N го означува бројот на јазли во control flow графот. Во нашиот случај Е = 22, а N = 18, па така V(G) = 22 - 18 + 2 = 6, при што пак добиваме дека цикломатската комплексност на кодот е 6.

3. Третиот начин е да ја пресметаме цикломатската комплексност преку формулата V(G) = P + 1, каде P е бројот на предикатни јазли. Во нашиот случај бројот на предикатни јазли е 5, па така V(G) = 5 + 1 = 6, при што пак добиваме дека цикломатската комплексност на кодот е 6.
### Тест случаи според критериумот Every statement
За да го извршиме every statement методот потребно е сите јазли да ги изминеме барем по еднаш.
Бидејќи имаме 2 различни терминирачки патеки (од кои во едната е вклучен exception), минималниот број на тестови кои треба да ги напишеме за да ги изминеме сите јазли мора да е 2.

Test case 1:

Input:	list = {} (празна листа)

Во едниот тест случај input-от мора да е празна листа за да ги изминеме јазлите кои се наоѓаат на терминирачката патека во која има фрлање на exception. 
Всушност во првиот test case праќаме празна листа во влезот на функцијата function за да ги изминеме јазлите кои се изминуваат кога програмата терминира преку exception, кој се фрла кога за влез во функцијата праќаме празна листа. На тој начин ќе ги изминеме јазлите 1, 2, 3, и 16.
Во овој тест случај нема да добиеме output, туку ќе биде фрлен исклучокот IllegalArgumentException со пораката "List length should be greater than 0".

Test case 2:

Input: list = {"#","0","#"}

Во вториот test case ја праќаме листата {"#","0","#"} како влез на функцијата function за да ги доизминеме јазлите кои не успеавме да ги изминеме со помош на првиот test case, односно јазлите кои се наоѓаат на втората терминирачка патека во која програмата завршува нормално, без да биде фрлен исклучок. 
Со input-от {"#","0","#"} успеваме да ги задоволиме сите преостанати услови во кодот, за потоа да може да ги изминеме и линиите кои се наоѓаат во нив. За условот "!list.get(i).equals("#")" да биде исполнет потребно е да има барем една нула во листата и на тој начин го задоволуваме овој услов, па така ќе почнеме да ги изминуваме линиите код кои се наоѓаат во тој блок од тој услов. Бидејќи нулата во листата е поставена помеѓу 2 мини успеваме да ги задоволиме и другите два услови "(i - 1 >= 0 && list.get(i - 1).equals("#")" и "i + 1 < list.size() && list.get(i + 1).equals("#")", па така на овој начин ќе ги изминеме и тие линии код кои се наоѓаат во овие if блокови. За линијата код која се наоѓа во else блокот да ја изминеме потребно е во листата што ја праќаме да има и мина, коешто веќе е задоволено. Сите преостанати линии од кодот ќе бидат изминати при овој нормален тек на извршување.
Со овој test case ќе ги изминеме сите јазли од кодот освен јазолот 3 кој го означува exception-от, односно ќе бидат изминати јазлите 1, 2, 4, 5.1, 5.2, 6, 13, 14, 5.3, 7, 8, 9, 10, 11, 12, 15, 16.
Во овој test case output-тот кој ќе го добиеме е {"#","2","#"} 

Со овие два test cases успеваме да ги изминеме сите statements.

Слика од табелата на every statement методот:


![Every Statement](https://user-images.githubusercontent.com/48767427/83370040-79280100-a3be-11ea-8636-0506d57a14be.png)


### Тест случаи според критериумот Every branch
За да го извршиме every branch методот потребно е сите гранки (branches) да ги изминеме барем по еднаш.
Бидејќи имаме 2 различни терминирачки патеки (од кои во едната е вклучен exception), минималниот број на тестови кои треба да ги напишеме за да ги изминеме сите гранки мора да е 2.

Test Case 1:

Input:	list = {} (празна листа)

Во едниот тест случај input-от мора да е празна листа за да ги изминеме гранките кои се наоѓаат на терминирачката патека во која има exception. 
Всушност во првиот test case праќаме празна листа во влезот на функцијата за да ги изминеме гранките кои се изминуваат кога програмата терминира преку exception, кој се фрла кога за влез во функцијата праќаме празна листа. На тој начин ќе ги изминеме гранките 1->2, 2->3, 3->16.
Во овој тест случај нема да добиеме output, туку ќе биде фрлен исклучокот IllegalArgumentException со пораката "List length should be greater than 0".

Test case 2:

Input: list = {"0","#","0","#","0"}

Во вториот тест случај ја праќаме листата {"0","#","0","#","0"} како влез на функцијата function за да ги доизминеме гранките кои не успеавме да ги изминеме со помош на првиот test case, односно гранките кои се наоѓаат на втората терминирачка патека во која програмата завршува нормално, без да биде фрлен исклучок. 
Со input-от {"0","#","0","#","0"} успеваме да ги задоволиме сите преостанати услови во кодот, за да ги изминеме сите гранки кои постојат во кодот при негово нормално извршување. Со нулите на почеток и крај на листата успеваме да ги изминеме гранките 8->10 и 10->12 и тоа е случајот кога нема да се влезе во блоковите каде имаме услов за претходното и следното поле да не биде index out of bounds. Со нулата во средина успеваме да ги изминеме тие гранки коишто ги поврзуваат и линиите што се во условите коишто претходно спомнавме дека не ги задоволивме.
Гранката којашто поврзува јазол којшто е во else блокот успеваме да ја изминеме бидејќи во input-от кој го праќаме има мина, а гранките од поголемиот if ќе бидат изминати бидејќи сме пратиле и нули во input-от. Сите други гранки ќе бидат изминати во текот на нормалното извршување на програмата.
Со овој test case ќе ги изминеме сите гранки од кодот освен гранките 2->3 и 3->16 кои се наоѓаат на терминирачката патека која го сочинува  exception-от, односно ќе бидат изминати гранките 1->2, 2->4, 4->5.1, 5.1->5.2, 5.2->6, 5.2->15, 6->7, 6->13, 13->14, 7->8, 8->9, 8->10, 9->10, 10->11, 10->12, 11->12, 12->14, 14->5.3, 5.3->5.2 и 15->16

Во овој test case output-тот кој ќе го добиеме е {"1","#","2","#","1"}

Со овие два test cases успеваме да ги изминеме сите гранки.

Слика од табелата на every branches методот:


![Every Branch](https://user-images.githubusercontent.com/48767427/83370082-965ccf80-a3be-11ea-807c-1ceb7cc8ce9c.png)


### Објаснување за напишаните unit tests

Слика од тест класата:


![unit_testovi](https://user-images.githubusercontent.com/48767427/83370293-3fa3c580-a3bf-11ea-960c-1da3d376b07e.png)


#### Every Statement unit testing
Првата функција со која ќе извршиме unit тестирање за Every Statement методот е функцијата everyStatementTest(). 
За првиот тест бидејќи станува збор за тестирање дали програмата терминирала со фрлање на exception, ќе искористиме 2 assertions: assertThrows и assertTrue.
1. assertThrows ќе креира објект од класата RuntimeException, кој како влез ќе го прима исклучокот што би се фрлил кога на функцијата function од класата SILab2 за влез ќе и пратиме празна листа.
2. Со assertTrue ќе провериме дали навистина програмата терминирала со фрлање на исклучок со пораката "List length should be greater than 0".

За вториот тест бидејќи сакаме да истестираме нормално терминирање на програмата, ќе го искористиме assertion-от assertEquals со кој ќе провериме дали за одреден input во функцијата function од класата SILab2, ќе добиеме соодветен output.

#### Every Branch unit testing
На ист начин ја пишуваме и функцијата everyBranchTest() со која ќе извршиме unit тестирање за Every Branch методот. Различен ќе биде само input-от и output-от во вториот test case кој го тестираме со assertEquals методот.
