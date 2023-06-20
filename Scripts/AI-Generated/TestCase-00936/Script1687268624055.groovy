import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_verify-background-color-of-button'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/verify-background-color-of-button/79027')

'step 2: Add visual checkpoint at Page_t_verify-background-color-of-button'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00936_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
