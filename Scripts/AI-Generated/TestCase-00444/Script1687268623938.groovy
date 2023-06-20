import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-pass-captcha-image-text-in-textbox-on-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-pass-captcha-image-text-in-textbox-on-runtime/6528/3')

'step 2: Add visual checkpoint at Page_t_how-to-pass-captcha-image-text-in-textbox-on-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00444_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
