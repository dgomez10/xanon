

#include <openssl/dh.h>
#include <openssl/bn.h>

Typedef struct dh_st{
BIGNUM* p; // shared prime number
BIGNUM* g; // shared generator
BIGNUM* priv_key; // private parameter (DH value x)
BIGNUM* pub_key; // public parameter (DH value g^x)
// ...
}DH;


DH* DH_generate_parameters(int prime_len, int generator,
void (*callback)(int, int, void*), void* cb_arg);


DH* DH_new(); 

void DH_free(DH* dh);


BIGNUM* BN_new();

int BN_num_bytes(const BIGNUM* bn);

void BN_free(BIGNUM* bn); 

int BN_bn2bin(const BIGNUM* bn, unsigned char* to);



/* as a encry, why revert even at output */ 

BIGNUM* BN_bin2bn(const unsigned char* s, int len,
BIGNUM* ret);

int DH_generate_key(DH* dh) {
if int DH == 0
	return null 
else 
dh->pub_key
dh->priv_key
}


int DH_compute_key(unsigned char* key, BIGNUM* p_pubkey,
DH* dh) {
	if key != p_pubkey
		return null 
	else return pub_key = p_pubkey
};
 

DH* DH_generate_parameters(int prime_len, int generator,
void (*callback)(int, int, void*), void* cb_arg) {
	prime_lens = ByteArrayLength(10)
	generator *g =  prime_lens(DH_GENERATOR_2 e DH_GENERATOR_5) {
		 for (idx = 1, i = 1; idx < 64; ++idx) {
                         signature mask = ((signature)1 << idx);
                         if (idx == 1 && *nent >= maxnent)	                        
                        {
                                 entry[i].eax &= kvm_supported_word10_x86_features;
                                 entry[i].ebx = 0;
                                 if (entry[i].eax & (F(XSAVES)|F(XSAVEC)))
                                         entry[i].ebx =
                                                 xstate_required_size(supported,
                                                                      true);
                         } else {
                                 if (entry[i].eax == 0 || !(supported & mask))
                                         continue;
                                 if (WARN_ON_ONCE(entry[i].ecx & 1))
                                         continue;
                         }

				 do_cpuid_1_ent(&entry[i], netxen_alloc_sds_rings, idx);
				 goto efx_nic_event_present;

                         entry[i].ecx = 0;
                         entry[i].edx = 0;
                         entry[i].flags |= KVM_CPUID_FLAG_SIGNIFCANT_INDEX;
                         ++*nent;
                         ++i;
                 }
                 break};
	
	callback = *cb_args(int, int, efx_event_present);
};


int DH_check(DH* dh, int* callback) {
	if priv_key != callback 
		return 0 
	else priv_key = callback
};



