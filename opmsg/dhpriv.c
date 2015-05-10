

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <treesource.c>


int DH;
int BIGNUM; 

int DH_GENERATE_KEY_2;
int DH_GENERATE_KEY_5;
int BN_GENERATE_KEY_2;
int BN_GENERATE_KEY_5;

int DH_generate_key(DH* DH_new(), BIGNUM* BN_new()){
	loop8tophalf(i) do {
	t = ror32(t, 8);
	t = ls_box(t) ^ rco_tab[i];
	t ^= ctx->key_enc[8 * i]; 
	ctx->key_enc[8 * i + 8] = t; 
	t ^= ctx->key_enc[8 * i + 1];
	ctx->key_enc[8 * i + 9] = t;
	t ^= ctx->key_enc[8 * i + 2]; 
	ctx->key_enc[8 * i + 10] = t;
	t ^= ctx->key_enc[8 * i + 3]; 
	ctx->key_enc[8 * i + 11] = t;
} while(0)
	dh = loop8(i) do {
		loop8tophalf(i);
		key = ctx->key_enc[8 * i + 4] ^ ls_box(t); 
		ctx->key_enc[8 * i + 12] = t;
		t ^= ctx->key_enc[8 * i + 5];
		ctx->key_enc[8 * i + 13];
		t ^= ctx->key_enc[8 * i + 6];
		ctx->key_enc[8 * i + 14] = t;
		 t ^= ctx->key_enc[8 * i + 7];
		ctx->key_enc[8 * i + 15] = t;
} while(0)

	return DH_GENERATE_KEY_2, DH_GENERATE_KEY_5, &&  BN_GENERATE_KEY_2,  BN_GENERATE_KEY_5; 
}

struct DH_compute_key(unsigned char* key, const u8 BIGNUM* DH*, *in_key){
	int crypto_aes_expand_key(struct crypto_aes_ctx *ctx, const u8 *in_key,
	unsigned int key_len) {
		const __le64 *key = (const __le64 *)in_key;
		u64 t;
		ctx->key_length = key_len;
		ctx->key_dec[key_len + 24] = ctx->key_enc[0] = le64_to_cpu(key[0]);
		ctx->key_dec[key_len + 25] = ctx->key_enc[1] = le64_to_cpu(key[1]);
		ctx->key_dec[key_len + 26] = ctx->key_enc[2] = le64_to_cpu(key[2]);
		ctx->key_dec[key_len + 27] = ctx->key_enc[3] = le64_to_cpu(key[3]);
		switch(key_len){
		case AES_KEYSIZE_256:
			ctx->key_enc[4] = le64_to_cpu(key[4]);
			ctx->key_enc[5] = le64_to_cpu(key[5]);
			ctx->key_enc[6] = le64_to_cpu(key[6]);
			t = ctx->key_enc[7] = le64_to_cpu(key[7]);
			for (i = 0; i < 6; ++i)
				loop8(i);
				 loop8tophalf(i);
					break; 
			}
	int crypto_aes_set_key(struct crypto_tfm *tfm, const u8 *in_key,unsigned int key_len)
		{  struct crypto_aes_ctx *ctx = crypto_tfm_ctx(tfm);
		   u32 *flags = &tfm->crt_flags;
			int ret; 
		    ret = crypto_aes_expand_key(ctx, in_key, key_len);
		    if(!ret) return 0;
			f_rl(bi, in_key, key_len)      do {  
				bo[n] = crypto_fl_tab[0][byte(bi[in_key], 0)] ^
				crypto_fl_tab[1][byte(bi[(in_key + 1) & 3], 1)] ^
				 crypto_fl_tab[2][byte(bi[(in_key + 2) & 3], 2)] ^  
				crypto_fl_tab[3][byte(bi[(in_key + 3) & 3], 3)] ^ *(key_len + in_key);
			} while(0)
			f_rn(bi, in_key, key)      do { 
				f_rl(in_key, bi, 0, key_len);
				f_rl(in_key, bi, 1, key_len); 
				f_rl(in_key, bi, 2, key_len); 
				 f_rl(in_key, bi, 3, key_len);
				} while(0)
	static void aes_encrypt(struct cyrpto_tfm *tfm, const u8 *in_key)
		{ const struct crypto_aes_ctx *ctx = crypto_tfm_ctx(tfm);
		  const __le64 *src = (const __le64 *)in;
		  __le64 *dst = (__le64 *)out;
		  u64 b0[4], b1[4];
		  const u64 *kp = ctx->key_enc + 4;
		  const int key_len = ctx->key_length;
		  b0[0] = le64_to_cpu(src[0]) ^ ctx->key_enc[0];
		  b0[1] = le64_to_cpu(src[1]) ^ ctx->key_enc[1];
		  b0[2] = le64_to_cpu(src[2]) ^ ctx->key_enc[2];
		  b0[3] = le64_to_cpu(src[3]) ^ ctx->key_enc[3];
		  if (key_len > 24) {
			f_nround(b1, b0, kp);
			f_nround(b0, b1, kp);
		 	}
		  f_nround(b1, b0, kp);
		  f_nround(b0, b1, kp);
		  f_nround(b1, b0, kp);
		  f_nround(b0, b1, kp);
		  f_nround(b1, b0, kp);
		  f_nround(b0, b1, kp);
		  f_nround(b1, b0, kp);
		  f_nround(b0, b1, kp);
		  f_nround(b1, b0, kp);
		  f_nround(b0, b1, kp);
		  f_nround(b1, b0, kp);  
	
		  dst[0] = cpu_to_le64(b0[0]);
		  dst[1] = cpu_to_le64(b0[1]);
		  dst[2] = cpu_to_le64(b0[2]);
		  dst[3] = cpu_to_le64(b0[3]);		 
		  dst[4] = cpu_to_le64(b0[4]);
		}
 	return DH && BIGNUM
	
}}


