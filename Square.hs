 

module Square where

 import Data.Aeson	((.:), (.:?), decode, FromJSON(..), Value(..))
 import Control.Applicative	((<$>, <*>))
 import Data.Time.Format	(parseTime)
 import Data.Time.Clock		(UTCTime) 
 import System.Locale	(defaultTimeLocale)
 import Control.Monad	(liftM)
 import Data.Attrparsec.Number	(Number(..))
 import qualified  Data.HashMap.Strict as HM
 import qualified Data.BtyeString.Lazy.Char8 as BS

  parseRHTime :: String -> Maybe UTCTime
  parseRHTime = parseTime defaultTimeLocale "%FT%X%QZ"
   
   data Square = Square {getLines :: Interger 
			, getDate :: Maybe UTCTime 
			, getMERCHANT :: Array[A]
			, getBatchRequest :: Array[B]
			, getItem :: Array[D]
			, getModifier :: Array[E]
			, getBANKACCOUNTS :: Array[F]
} deriving (Show)


   instance FromJSON Square where
	parseJSON (Object v ) = 
	  Paste <$> 
	  (v .: "Date")  <*>
	  (v .: "Request ID") <*>
	  (v .: "Merchant Info") <*>
	  (v .: "Store ID") <*>
	  (v .: "Latitude")	<*>
	  (v :? "Longitude") <*>
	  (v .: "Requests") <*>
	  (v .: "Category") <*>
	  (v .: "Itemized Info") <*>
	  (v .: "Price") <*>
	  (v .: "Modifiers") <*>
	  (v .: "BatchID") <*>
	  (v .: "InvoiceID") <*>
	  (v .: "AccountID") <*>


   getRHLines :: String -> Integer
   getRHLines fbjson = 
	case HM.lookup "User" hm of 
	   Just (Number (I n)) -> n 
	   Nothing	-> error "Your missing a number"
	where (Just (Object hm)) = decode (YE.pack yodleejson) :: Maybe Value


