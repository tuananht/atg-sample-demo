import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-there-a-way-to-retrieve-the-value-of-a-variable-from-javascript-in-katalon-recorder'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-there-a-way-to-retrieve-the-value-of-a-variable-from-javascript-in-katalon-recorder/83892')

'step 2: Add visual checkpoint at Page_t_is-there-a-way-to-retrieve-the-value-of-a-variable-from-javascript-in-katalon-recorder'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00963_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
