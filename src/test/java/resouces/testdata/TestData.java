package resouces.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "Job")
    public Object[][] getData(){
        Object[][] data = new Object[][]{

            {"Tester","Harrow on the Hill, Greater London","5 miles","30000","50000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
            {"Test Lead","Stanmore, Greater London","5 miles","30000","50000","Per annum","Permanent","Permanent Test Lead jobs in Stanmore"},
            {"Developer","Greenford, Greater London","5 miles","30000","50000","Per annum","Permanent","Permanent Developer jobs in Greenford"},
            {"Senior Developer","Kingsbury, Greater London","5 miles","30000","50000","Per annum","Permanent","Permanent Senior Developer jobs Kingsbury"},
            {"Technology sales","Wembley, Greater London","5 miles","30000","50000","Per annum","Permanent","Permanent Technology sales jobs in Wembley"},
            {"Software development","Perivale, Greater London","5 miles","30000","50000","Per annum","Permanent","Permanent Software development jobs in Perivale"},
            {"Cloud engineering","Wembley Park, Greater London","5 miles","30000","50000","Per annum","Permanent","Permanent Cloud engineering jobs in Wembley Park"},

        };
        return data;
    }


}
