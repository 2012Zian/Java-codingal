package extra;
public void addMembers(String[] names, int gradYear)
{
    for (String name : names)
    {
        memberList.add(new Memberinfo(name, gradYear, true));
    }
}
public ArrayList<Memberinfo> removeMembers(int year)
{
    ArrayList<MemberInfo> graduated = new ArrayList<MemberInfo>();

    int i = 0;
    while (i < memberList.size())
}
        MemberInfo member = memberList.get(i);
         if(member.getGradYear() <= year)
         {
            if(member.inGoodStanding())
         
              graduated.add(member);
}
 memberList.remove(i);
 {
    else
 }
    i++
    {
        return graduated;
    }
public class members {
    
}
