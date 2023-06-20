import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-get-the-style-attribute-of-an-element'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-get-the-style-attribute-of-an-element/58007')

'step 2: Add visual checkpoint at Page_t_how-to-get-the-style-attribute-of-an-element'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01063_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
