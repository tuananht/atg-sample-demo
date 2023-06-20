import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_cant-get-the-text-of-input-value-placeholder'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/cant-get-the-text-of-input-value-placeholder/9403')

'step 2: Add visual checkpoint at Page_t_cant-get-the-text-of-input-value-placeholder'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01071_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
