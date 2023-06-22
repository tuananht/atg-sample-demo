import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog-steps-to-becoming-a-great-qa-lead'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/9-steps-to-becoming-a-great-qa-lead')

'step 2: Add visual checkpoint at Page_resources-center_blog-steps-to-becoming-a-great-qa-lead'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00047_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
