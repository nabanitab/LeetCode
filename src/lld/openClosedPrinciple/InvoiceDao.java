package lld.openClosedPrinciple;

import lld.singleResposibilityPrinciple.Invoice;


//open for extension closed for modification
public interface InvoiceDao {

    public void saveInvoice(Invoice invoice);
}
