public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 40;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
        // if the 'if' condition is not satisfied the else if consition
        // is checked
		else if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
        // if all the else if condtion are not satisfied finaly else block is excecuted
		// if both 'if' and 'else if' condtions are not satisfied and else block
        // is not present then nothing is executed
        else
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}