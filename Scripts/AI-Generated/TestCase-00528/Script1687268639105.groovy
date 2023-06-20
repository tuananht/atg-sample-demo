import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-scroll-up-on-android-unable-to-use-scroll-to-text-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-scroll-up-on-android-unable-to-use-scroll-to-text-either/9535/2')

'step 2: Add visual checkpoint at Page_t_unable-to-scroll-up-on-android-unable-to-use-scroll-to-text-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00528_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
