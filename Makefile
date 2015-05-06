

_DEPS = bh.h dh.h; 
 DEPS =  $(pathsubst, %,$(IDIR)/ ,$(_DEPS))  //incorrect

_OBJS = dserver.o, eclient.o 
 OBJS = $(pathsubst, %,$(ODIR)/ , $(_OBJS))

CC=gcc
CFLAGS=-I.
DEPS = bu.c


$(ODIR)/%.o %.c $(DEPS)
	$(CC) $@ $^ $@ $< $(CFLAGS)

.make: $(OBJS)
	gcc -o $@ $^ $(CFLAGS)


ifeq($(make),)
	$(ERR)
 end if




am__is_gnu_make = { \
 if test -z '$(MAKELEVEL)'; 
	fread(); 
}
