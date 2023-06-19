import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_c_product-forums'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/c/product-forums/76')

'step 2: Add visual checkpoint at Page_c_product-forums'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00120_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
