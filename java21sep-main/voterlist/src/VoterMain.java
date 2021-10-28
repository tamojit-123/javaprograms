import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class VoterMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Address ad = new Address("xx", 123, 32434);
        Voter v = new Voter("pratyush", 23, ad);
        List<Voter> vlist = Arrays.asList(v, new Voter("raman", 0, null), new Voter(null, 0, null));

        System.out.println("------------------Displaying all voters whose address is null ----------------------");

        for (Voter vi : vlist) {
            Optional<Address> op = Optional.ofNullable(vi.getAdd());
            if (op.isEmpty()) {
                System.out.println("If address is null print the voter data" + vi);

            } else {
                System.out.println("Invalid Voters");
            }

        }
        System.out.println("------------------Give a default value for address if the address is null----------------------");

        for (Voter vi : vlist) {
            Optional<Address> op = Optional.ofNullable(vi.getAdd());
            Address ad1 = Optional.ofNullable(vi.getAdd()).orElse(new Address("Wolf street", 125, 481001));
            if (op.isEmpty()) {
                vi.setAdd(ad1);

            }
            System.out.println(ad1);
            //throw an exception if voter name is null
            Supplier<VoterException> obj = () -> new VoterException("name is null");
            try {
                Optional<String> ob = Optional.ofNullable(vi.getvName());
                System.out.println(ob.isEmpty());
                ob.orElseThrow(obj);

            } catch (VoterException ve) {
                ve.printStackTrace();
            }
        }

        Optional<Voter> vf = findVoterByZipCode(vlist, 481001);
        System.out.println(vf);
    }

    public static Optional<Voter> findVoterByZipCode(List<Voter> obb, int zipCode) {
        Optional<Voter> obc = obb.stream().filter(v -> v.getAdd().getPinCode() == zipCode).findFirst();

        return obc;
    }
}