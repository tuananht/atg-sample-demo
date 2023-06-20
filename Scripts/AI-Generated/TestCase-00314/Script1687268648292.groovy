import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_c_product-forums_katalon-testops'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/c/product-forums/katalon-testops/23')

'step 2: Add visual checkpoint at Page_c_product-forums_katalon-testops'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00314_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
